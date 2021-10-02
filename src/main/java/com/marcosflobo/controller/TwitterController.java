package com.marcosflobo.controller;

import com.marcosflobo.client.TwitterAPI;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/tweets")
public class TwitterController {

  private TwitterAPI twitterAPI;

  public TwitterController(TwitterAPI twitterAPI) {
    this.twitterAPI = twitterAPI;
  }

  @Get("/")
  public HttpResponse getTweetsFromUser() {
    return HttpResponse.ok(twitterAPI.getTweetsFromUser());
  }
}
