package com.lyn.app;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @program: dubbo-parent
 * @author: lyn
 * * @create: 2021-02-26 22:04
 **/
public class MainDemo {
    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getExtension("http");
        System.out.println("http:" + protocol);
    }
}
