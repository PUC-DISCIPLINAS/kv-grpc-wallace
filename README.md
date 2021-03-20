## Author

#### Wallace barbosa berto do nascimento.

## Requirements

Develop a Key-Value store in memory using gRPC.

The primitives of the Key-Value Store are:

- put(key, value)
- get(key) : value
- getAllKeys() : Key[]

In this project, you should use the gRPC protocol to allow the customer to add a key and value. In this project, it will not be necessary to implement data buckets for each customer. That is, all customers will be able to access a common database.

## Techs

- Java 1.8

## Run

### Clone the repository

```bash
# Clone Repository
$ git https://github.com/PUC-DISCIPLINAS/kv-grpc-wallace.git
```

### Run Server

```bash
# Go to folder
$ cd kv-grpc-wallace/
```

Windows:

`run server`

Linux:

`$ sh server.sh`

The console going to show the result

### Run Client

```bash
# Go to folder
$ cd kv-grpc-wallace/
```

Windows:

`run client`

Linux:

`$ sh client.sh`

The console going to show the result

## Commands

```Markdown
:put [key] [value] - create a keyValue exemple: "put 13 car"
:get [key] - get a keyValue exemple: "get 13"
:list - list all keys
```

## License

This project is under the MIT license. See the file [LICENSE](LICENSE) for more details.