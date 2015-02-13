# tknz
A DFA-based tokenizer

## Rationale

As a computational theory student, you usually learn to write deterministic finite state automatons to represent regular grammars and recognize regular languages. However, when using a production-level lexer, grammars are written in a significantly different way: using some sort of regular expressions. `tknz` narrows the breach between these two approaches at regular grammars by providing a language that specifically calls for writing deterministic finite-state automatons.

## Contributing

### Setup

Install Java 1.6 or higher. Don't forget the JDK.

`tnkz` depends on ANTLR v4. Download `antlr-4.5-complete.jar` from the [ANTLR official site](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4). You don't need to follow the full instructions because the tknz workflow has been customized for uniformity.

Download the source code using the GitHub desktop tool, or:

```
git clone https://github.com/jleeothon/tknz
```

Copy ANTLR (`antlr-4.5-complete.jar`) to the `lib` folder in your local copy of your repository.

`cd` to the `tknz` directory. Then set your environment:

- On Unix:

```
source bin/configure
```

- On Windows:

```
bin\configure
```

Now you're ready to make changes.

To build, run the `build` command.
