@echo off
SET TKNZ_ROOT=%~dp0
SET CLASSPATH=.;%TKNZ_ROOT%lib\antlr-4.5-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun=java org.antlr.v4.runtime.misc.TestRig $*
doskey build=%TKNZ_ROOT%build.bat
doskey bundle=%TKNZ_ROOT%bundle.bat
doskey tknz=java -classpath %TKNZ_ROOT%lib\antlr-4.5-complete.jar;%TKNZ_ROOT%bin tknz.exec.Main $*
if not exist %TKNZ_ROOT%bin mkdir %TKNZ_ROOT%bin
prompt (tknz) $p$g
