@echo off
SET TKNZ_ROOT=%~dp0..
SET CLASSPATH=.;%TKNZ_ROOT%\lib\antlr-4.5-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun=java org.antlr.v4.runtime.misc.TestRig $*
doskey build=%TKNZ_ROOT%\bin\build
doskey tknz=java org.antlr.v4.runtime.misc.TestRig grammar.Tokenizer s $*
prompt (tknz) $p$g
