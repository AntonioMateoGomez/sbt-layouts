---
layout: docs
title: Organization API
---

# Organization API

Github4s supports the [Organization API](https://developer.github.com/v3/orgs/). As a result,
with Github4s, you can interact with:

- [Members](#members)
  - [List members](#list-members)

The following examples assume the following imports and token:



They also make use of `cats.Id`, but any type container implementing `MonadError[M, Throwable]` will do.

Support for `cats.Id`, `cats.Eval`, and `Future` (the only supported option for scala-js) are
provided out of the box when importing `github4s.{js,jvm}.Implicits._`.

## Members

### List members

You can list the members for a particular organization with `listMembers`; it takes as arguments:

- `org`: name of the organization for which we want to retrieve the members.
- `filter`: to retrieve "all" or only "2fa_disabled" users, optional.
- `role`: to retrieve "all", only non-owners ("member") or only owners ("admin"), optional.
- `pagination`: Limit and Offset for pagination, optional.

To list the members for organization `47deg`:


The `result` on the right is the corresponding [List[User]][user-scala].

See [the API doc](https://developer.github.com/v3/orgs/members/#members-list) for full reference.

As you can see, a few features of the organization endpoint are missing.

As a result, if you'd like to see a feature supported, feel free to create an issue and/or a pull request!

[user-scala]: https://github.com/47deg/github4s/blob/master/github4s/shared/src/main/scala/github4s/free/domain/User.scala
