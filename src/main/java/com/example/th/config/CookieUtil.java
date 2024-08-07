package com.example.th.config;


import java.util.Arrays;
import java.util.Optional;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtil {

    // Add or update a cookie
    public static void addCookie(HttpServletResponse response, String name, String value, int maxAgeInSeconds) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAgeInSeconds);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

    // Retrieve a cookie by its name
    public static Optional<Cookie> getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            return Arrays.stream(cookies)
                    .filter(c -> c.getName().equals(name))
                    .findFirst();
        }
        return Optional.empty();
    }

    // Retrieve a cookie value by its name
    public static String getCookieValue(HttpServletRequest request, String name) {
        return getCookie(request, name)
                .map(Cookie::getValue)
                .orElse(null); // Default to null if the cookie is not found
    }

    // Delete a cookie by its name
    public static void deleteCookie(HttpServletResponse response, HttpServletRequest request, String name) {
        Optional<Cookie> cookie = getCookie(request, name);
        if (cookie.isPresent()) {
            Cookie toDelete = cookie.get();
            toDelete.setValue("");
            toDelete.setPath("/");
            toDelete.setMaxAge(0); // Mark the cookie for deletion by setting its maximum age to zero
            response.addCookie(toDelete);
        }
    }
}
