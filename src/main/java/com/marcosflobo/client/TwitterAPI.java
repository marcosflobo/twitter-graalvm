package com.marcosflobo.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;
import static io.micronaut.http.HttpHeaders.AUTHORIZATION;
import static io.micronaut.http.HttpHeaders.CONTENT_TYPE;

@Client("https://api.twitter.com/2")
@Header(name = AUTHORIZATION, value = "Bearer ${twitter.bearer-token}")
@Header(name = CONTENT_TYPE, value = "application/json")
public interface TwitterAPI {

  @Get("/tweets?ids=1228393702244134912,1227640996038684673,1199786642791452673&tweet.fields=created_at&expansions=author_id&user.fields=created_at")
  String getTweetsFromUser();

}
