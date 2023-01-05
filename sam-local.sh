#!/bin/sh
docker build . -t my-app-graal
mkdir -p build
docker run --rm --entrypoint cat my-app-graal  /home/application/function.zip > build/function.zip

sam local start-api -t sam.yaml -p 3000

