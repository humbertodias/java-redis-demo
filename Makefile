server-up:
	docker-compose up -d

server-down:
	docker-compose down

client-package:
	mvn package

client-up: client-package
	java -jar target/redis-demo.jar


format:
	mvn formatter:format
