---
layout: docs
title: User API
---

# User API

Github4s supports the [User API](https://developer.github.com/v3/users/). As a result,
with Github4s, you can interacts with:

- [Users](#users)
  - [Get a user](#get-a-user)
  - [Get an authenticated user](#get-an-authenticated-user)
  - [Get a list of users](#get-a-list-of-users)

The following examples assume the following imports and token:

## Users

### Get a user

Get information for a particular user.

You can get a user using `get`, it takes as argument:

- `username`: of the user to retrieve.


The `result` on the right is the corresponding [User][user-scala].

See [the API doc](https://developer.github.com/v3/users/#get-a-single-user) for full reference.


### Get an authenticated user

Get information of the authenticated user making the API call.

You can get an authenticated user using `getAuth`:


The `result` on the right is the corresponding [User][user-scala].

See [the API doc](https://developer.github.com/v3/users/#get-the-authenticated-user) for full reference.


### Get a list of users

You can get a list of users using `getUsers`, it takes as arguments:

- `since`: The integer ID of the last User that you've seen.
- `pagination`: Limit and Offset for pagination.


The `result` on the right is the corresponding [List[User]][user-scala].

See [the API doc](https://developer.github.com/v3/users/#get-all-users) for full reference.

As you can see, a few features of the user endpoint are missing.

As a result, if you'd like to see a feature supported, feel free to create an issue and/or a pull request!

[user-scala]: https://github.com/47deg/github4s/blob/master/github4s/shared/src/main/scala/github4s/free/domain/User.scala
