package com.thinmoo.cloud.mqtt;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author:Dong
 * @Date：2020/7/31 9:59
 */
@Slf4j
public class MqttSubClient {

    public MqttSubClient(MqttPushClient client){
        subScribeDataPublishTopic(client);
    }


    private void subScribeDataPublishTopic(MqttPushClient client){
        //订阅test_queue主题
       client.subscribe("test_queue");
    }



}
