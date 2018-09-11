---
layout: docs
title: Getting Started
---

# Getting started

## API token

In order to access the Github API, you will need to have [an access token][access-token] with the
appropriate scopes (i.e. if you want to create gists, your token will need to have the gist scope).

## Github4s

First things first, we'll need to import `github4s.Github` which is the entry point to the Github
API in Github4s.

As an introductory example, we can get a user with the following:


`user1` in this case is a `GHIO[GHResponse[User]]` which we can run (`foldMap`) with
`exec[M[_], C]` where `M[_]` that represents any type container that implements
`MonadError[M, Throwable]` (for instance `cats.Eval`) and `C` represents a valid implementation of
an [HttpClient][http-client].

The previously mentioned implicit classes carry out of the box
instances for working with [scalaj][scalaj] (for JVM-compatible apps) and [roshttp][roshttp] (for
scala-js-compatible apps). Take into account that in the latter case, you can only use `Future` and
`cats.effect.Async` (if you pull in the `github4s-cats-effect` dependency) in place of `M[_]`.

A few examples follow with different `MonadError[M, Throwable]`.

### Using `cats.Eval`


As mentioned above, `u1` should have an `GHResult[User]` in the right.


### Using `cats.Id`


### Using `scalaz.Task`


Note that you'll need a dependency to the `github4s-scalaz` pacakge to leverage `scalaz.Task`.

### Using `cats.effect.{Async, Sync}`

On the JVM, you can use any `cats.effect.Sync`, here we're using `cats.effect.IO`:


Using scala-js, you can use any `cats.effect.Async`, here we're using `cats.effect.IO`:


Note that you'll need a dependency to the `github4s-cats-effect` package to leverage
cats-effect integration.

## Specifying custom headers

The different `exec` methods let users include custom headers for any Github API request:

[http-client]: https://github.com/47deg/github4s/blob/master/github4s/shared/src/main/scala/github4s/HttpClient.scala
[scalaj]: https://github.com/scalaj/scalaj-http
[roshttp]: https://github.com/hmil/RosHTTP
[access-token]: https://github.com/settings/tokens
