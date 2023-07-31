install:
	mvn clean install

up:
	docker compose up --build -d api.template.dev

up-m1:
	docker compose up --build -d api.template.dev.m1

build:
	docker compose up --build -d api.template.dev.build

build-m1:
	docker compose up --build -d api.template.dev.buildm1