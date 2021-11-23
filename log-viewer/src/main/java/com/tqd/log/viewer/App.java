package com.tqd.log.viewer;

import com.hngd.zipkin.api.DefaultApi;
import com.hngd.zipkin.handler.ApiClient;
import com.hngd.zipkin.handler.ApiException;

public class App 
{
    public static void main( String[] args ) throws ApiException
    {
        ApiClient client=new ApiClient();
        client.setBasePath("http://192.168.0.167:9411/zipkin/api/v2");
		DefaultApi api=new DefaultApi(client);
		api.tracesGet(null, null, null, null, null, null, null, null)
		.forEach(t->{
			System.out.println(t);
		});
    }
}
