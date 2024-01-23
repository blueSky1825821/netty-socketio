package com.corundumstudio.socketio.units;

import org.junit.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DESCRIPTION:
 * <P>
 * </p>
 *
 * @author wangmin
 * @since 2022/6/24 20:30
 */
public class ConcurrentHashMapTest {
    @Test
    public void testRemove() {
        Map<String, Set<String>> map = new ConcurrentHashMap<>();
        Set<String> objects = new HashSet<>();
        objects.add("1");
        map.put("1", objects);
        map.remove("1");
        System.out.println(map.size());

    }
}
