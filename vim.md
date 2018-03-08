# Configurate vim from scratch:

* ```vim ~/.vimrc```:
```bash
filetype plugin indent on
syntax on
 
set nocp hls is et sw=4 sts=4 ts=4 nu rnu mouse=a ru so=4 sc
nn <c-j> :w <bar> :!g % <cr>
 
set clipboard=unnamedplus
 
:au BufNewFile *.cpp r ~/.vim/main.cpp | 0d
 
set timeoutlen=1000 ttimeoutlen=100
 
inoremap {<cr> {<cr>}<esc>O
```
  
    
    
* ```mkdir ~/.vim && vim ~/.vim/main.cpp```:  
... type template here ...
  
    
      
      
* ```mkdir ~/bin/ && vim ~/bin/g```:
```bash
g++ -Wall -Wextra -std=c++11 -O2 -DLOCAL $1 -o exec || exit 1
echo Run
./exec || exit 1
echo Out
tail -20 *.out
```
```chmod +x ~/bin/g```
