package com.akrome;

import akka.actor.ActorSystem;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

class MainRoute extends AllDirectives {
    Route getMainRoute() {
        return pathEndOrSingleSlash(() ->
                get(() -> complete("Hello, Diego")));
    }
}
