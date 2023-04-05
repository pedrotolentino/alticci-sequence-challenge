package service;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciSequenceService {

    @CacheResult(cacheName = "alticci-sequence")
    public Long getResultByIndex(Long index) {
        if (index == 0 || index == 1) return index;

        if (index == 2) return 1L;

        return getResultByIndex(index-3) + getResultByIndex(index - 2);
    }
}
