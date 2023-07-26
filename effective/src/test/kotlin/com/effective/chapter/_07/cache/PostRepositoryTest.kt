package com.effective.chapter._07.cache

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class PostRepositoryTest {
    @Test
    @Throws(InterruptedException::class)
    fun cache() {
        val postRepository = PostRepository()
        var key1: CacheKey? = CacheKey(1)
        postRepository.getPostById(key1!!)
        assertFalse(postRepository.getCache().isEmpty())
        key1 = null
        // TODO run gc
        println("run gc")
        System.gc()
        println("wait")
        Thread.sleep(3000L)
        assertTrue(postRepository.getCache().isEmpty())
    }
//    @Test
    //    void backgroundThread() throws InterruptedException {
    //        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    //        PostRepository postRepository = new PostRepository();
    //        CacheKey key1 = new CacheKey(1);
    //        postRepository.getPostById(key1);
    //
    //        Runnable removeOldCache = () -> {
    //            System.out.println("running removeOldCache task");
    //            Map<CacheKey, Post> cache = postRepository.getCache();
    //            Set<CacheKey> cacheKeys = cache.keySet();
    //            Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
    //            key.ifPresent((k) -> {
    //                System.out.println("removing " + k);
    //                cache.remove(k);
    //            });
    //        };
    //
    //        System.out.println("The time is : " + new Date());
    //
    //        executor.scheduleAtFixedRate(removeOldCache,
    //                1, 3, TimeUnit.SECONDS);
    //
    //        Thread.sleep(20000L);
    //
    //        executor.shutdown();
    //    }
}