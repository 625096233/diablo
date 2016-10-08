package me.hao0.diablo.server.service;

import me.hao0.common.model.Page;
import me.hao0.diablo.server.model.App;
import me.hao0.diablo.server.model.Response;

/**
 * Author: haolin
 * Email:  haolin.h0@gmail.com
 */
public interface AppService {

    /**
     * Add an application
     * @param app the app
     * @return the app id
     */
    Response<Long> save(App app);

    /**
     * Find an application by name
     * @param name the app name
     * @return the app
     */
    Response<App> findByName(String name);

    /**
     * List all applications
     * @param appName the app name(full match)
     * @param pageNo page no
     * @param pageSize page size
     * @return all applications
     */
    Response<Page<App>> pagingApp(String appName, Integer pageNo, Integer pageSize);

    /**
     * Delete the app
     * @param appName the app name
     * @return return true if delete successfully, or false
     */
    Response<Boolean> delete(String appName);
}
