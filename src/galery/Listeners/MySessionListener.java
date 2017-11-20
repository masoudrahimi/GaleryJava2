package galery.Listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by masaoud on 06/11/2017.
 */
public class MySessionListener implements HttpSessionListener {

    public static int counter_s=0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        counter_s=counter_s+1;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        counter_s=counter_s-1;
    }
}
