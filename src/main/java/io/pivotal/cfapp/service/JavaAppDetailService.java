package io.pivotal.cfapp.service;

import java.util.Map;

import io.pivotal.cfapp.domain.JavaAppDetail;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface JavaAppDetailService {

    Mono<Void> deleteAll();

    Flux<JavaAppDetail> findAll();

    public Flux<Map<String, String>> findSpringApplications();

    Mono<JavaAppDetail> findByAppId(String appId);

    Mono<JavaAppDetail> save(JavaAppDetail entity);
}
