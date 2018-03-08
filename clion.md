# Configure CLion from scratch:  

* Create `template` directory, add `main.cpp` with template code there

* Create `init.sh` file:
```bash
for T in {A..L}; do
    mkdir -p $T
    cp -r template/. $T
    printf "set(CMAKE_RUNTIME_OUTPUT_DIRECTORY \${CMAKE_CURRENT_SOURCE_DIR}/$T)\n" >> CMakeLists.txt
    printf "add_executable($T $T/main.cpp)\n\n" >> CMakeLists.txt
done
```
and run it

* Add this to `CMakeLists.txt`:
```cmake
set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DLOCAL -Wall -Wextra -O2")
```
[optional]
* Settings &rarr; Editor &rarr; File Types &rarr; Ignore files and folder &rarr; add `cmake-build-*`
