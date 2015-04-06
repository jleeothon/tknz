# tknz

A DFA-based tokenizer

## Rationale

As a computational theory student, you usually learn to write deterministic finite state automatons to represent regular grammars and recognize regular languages. However, when using a production-level lexer, grammars are written in a significantly different way: using some sort of regular expressions. `tknz` narrows the breach between these two approaches at regular grammars by providing a language that specifically calls for writing deterministic finite-state automatons.

For example, for a real number:

- Typical regular expression:

```Ruby
/[1-9][0-9]+(\.[0-9]+)?/
```

- tknz syntax, closer to what you learn as a beginner student in theory of computation class:

```
Automaton Number
  start state first-digit
    with "123456789" goto next-digits
  stop state next-digits
    with "0123456789" goto next-digits
    with "." goto dot
  state dot
    with "0123456789" goto decimals
  stop state decimals
    with "0123456789" goto decimals
```

### Installation

Install Java 8 JRE. Don't forget the JDK.

`tnkz` depends on ANTLR v4. Download `antlr-4.5-complete.jar` from the [ANTLR official site](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4). You don't need to follow the full instructions because the `tknz` workflow has been customized for uniformity.

Download the source code using one of the following:

- the GitHub desktop tool,
- the [zipped file](https://github.com/jleeothon/tknz/archive/master.zip),
- or the command line tool:

```dosbatch
git clone https://github.com/jleeothon/tknz
```

Copy ANTLR (`antlr-4.5-complete.jar`) to a `lib` folder in your local copy of your repository. It should look like this:

```
tknz
|-lib
| \- antlr-4.5-complete.jar
...
```

**Note**. Right now, the build system has only been readied for Windows (yes, you can hit me now :stuck_out_tongue_closed_eyes:).

`cd` to the `tknz` directory. Then set your environment:

- On Windows:

```dosbatch
configure
```

Now you're ready to make changes.

To build, run the `build` command.

If you make changes to the source grammar (Tknz.g4), run the `antlr4` command to it, then build again:

```dosbatch
antlr4 tknz\grammar\Tknz.g4
build
```

To bundle the project into a jar, run:

```dosbatch
bundle
```

## Usage

Given that you have (very important!) setup your environment, built and bundled, use the `tknz` command.

```
tknz grammar.tkn input.txt
```

The first argument should be a grammar file, the second argument is your input to parse.

Take this example grammar:

```
automaton Integer
    start state A // indentation is optional
        from "0" to "9" goto B
    stop state B
        from "0" to "9" goto B

automaton String
    start state initial-quote // state names may use dashes and underscores
        with '"' goto characters
    state characters
        from "A" to "Z" goto characters
        from "a" to "z" goto characters
        from "0" to "9" goto characters
        with " " goto characters
        with '"' goto end-quote
    stop state end-quote

automaton Identifier
    start state first-character
        from "A" to "Z" goto other-characters
        from "a" to "z" goto other-characters
    stop state other-characters
        from "A" to "Z" goto other-characters
        from "a" to "z" goto other-characters

automaton Whitespace
    start state 0
        with " " goto 1
    stop state 1
        with " " goto 1
```

And this input file:

```
"Hey" name "this is a great opportunity to know each other" Luckily we "might" be friends for 5 or 6 or 7 years or "forever"
```

You should get the following output:

```
(String) "Hey"
(Whitespace)  
(Identifier) name
(Whitespace)  
(String) "this is a great opportunity to know each other"
(Whitespace)  
(Identifier) Luckily
(Whitespace)  
(Identifier) we
(Whitespace)  
(String) "might"
(Whitespace)  
(Identifier) be
(Whitespace)  
(Identifier) friends
(Whitespace)  
(Identifier) for
(Whitespace)  
(Integer) 5
(Whitespace)  
(Identifier) or
(Whitespace)  
(Integer) 6
(Whitespace)  
(Identifier) or
(Whitespace)  
(Integer) 7
(Whitespace)  
(Identifier) years
(Whitespace)  
(Identifier) or
(Whitespace)  
(String) "forever"
```
