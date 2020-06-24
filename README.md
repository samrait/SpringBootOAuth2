# SpringBootOauth2
A simple and basic Spring-Boot example to secure REST APIs with authentication using Spring Boot , Security , OAuth2 and JPA.

OAuth (Open Authorization) is a simple way to publish and interact with protected data.
It is an open standard for token-based authentication and authorization on the Internet. When using OAuth2, grant type is the way an application gets the access token. Following are the grant types according to OAuth2 specification-
Authorization code grant
Implicit grant
Resource owner credentials grant
Client credentials grant
Refresh token grant

Resource Owner(User) - An entity capable of granting access to a protected resource. When the resource owner is a person, it is referred to as an end-user.
Client Application - The machine that needs to be authenticated.
Authorization Server - The server issuing access tokens to the client after successfully authenticating the resource owner and obtaining authorization
Resource Server - The resource server is the OAuth 2.0 term for your API server. The resource server handles authenticated requests after the application has obtained an access token.

https://www.javainuse.com/spring/springboot-oauth2-password-grant#:~:text=Define%20the%20Spring%20Boot%20Main%20Application.,before%20calling%20the%20Resource%20Server.
