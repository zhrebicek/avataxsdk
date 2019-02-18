#!/bin/bash

for i in $(find . -name '*.scala')
do
  if ! grep -q Copyright $i
  then
    cat license.md $i >$i.new && mv $i.new $i
  fi
done