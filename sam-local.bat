docker build . -t my-app-graal && docker run --rm --entrypoint cat my-app-graal  /home/application/function.zip > native-build/function.zip && sam local start-api -t sam.yaml -p 3000 

