for %%F in (test\*.tkn) do (
   java org.antlr.v4.runtime.misc.TestRig Tokenizer s %%F
)
