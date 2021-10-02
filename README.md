# Twitter GraalVM
This application runs a service on http://localhost:8080 exposing a set of endpoints to handle data from Twitter API.

## How to get a Twitter Bearer Token
https://developer.twitter.com/en/docs/authentication/oauth-2-0/bearer-tokens

## How to run the application
### Gradle
```shell
export BEARER_TOKEN="YOUR-TOKEN" && ./gradlew run
```
### Graal Native Image
(/\) Not working yet
```shell
export BEARER_TOKEN="YOUR-TOKEN" && ./build/native-image/application
```

## Build Graal Native Image
### Build Native Image
```shell
./gradlew nativeImage
```
The resultant binary is stored at `./build/native-image/application`

### Build Native Image inside Docker
```shell
./gradlew dockerBuildNative
```

## Endpoints available
| Endpoint | Description |
| ----------- | ----------- |
| /tweets | Get specific tweets |

### Examples
```shell
$ curl http://localhost:8080/tweets
{"data":[{"created_at":"2020-02-14T19:00:55.000Z","text":"What did the developer write in their Valentine’s card?\n  \nwhile(true) {\n    I = Love(You);  \n}","author_id":"2244994945","id":"1228393702244134912"},{"created_at":"2020-02-12T17:09:56.000Z","text":"Doctors: Googling stuff online does not make you a doctor\n\nDevelopers: https://t.co/mrju5ypPkb","author_id":"2244994945","id":"1227640996038684673"},{"created_at":"2019-11-27T20:26:41.000Z","text":"C#","author_id":"2244994945","id":"1199786642791452673"}],"includes":{"users":[{"name":"Twitter Dev","username":"TwitterDev","created_at":"2013-12-14T04:35:55.000Z","id":"2244994945"}]}}
```