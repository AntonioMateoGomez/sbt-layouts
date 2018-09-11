---
layout: docs
title: Repository API
---

### List contributors

List contributors to the specified repository,
sorted by the number of commits per contributor in descending order.

You can list contributors using `listContributors`, it takes as arguments:

- the repository coordinates (`owner` and `name` of the repository).
- `anon` Set to 1 or true to include anonymous contributors in results.

To list contributors:


The `result` on the right is the corresponding [List[User]][user-scala].

See [the API doc](https://developer.github.com/v3/repos/#list-contributors) for full
reference.

### List collaborators

List collaborators in the specified repository.

You can list collaborators using `listCollaborators`, it takes as arguments:

- the repository coordinates (`owner` and `name` of the repository).
- `affiliation`, one of `outside`, `direct`, or `all` (default `all`).
For more information take a look at [the API doc](https://developer.github.com/v3/repos/collaborators/#parameters).


The `result` on the right is the corresponding [List[User]][user-scala].

See [the API doc](https://developer.github.com/v3/repos/collaborators/#list-collaborators) for full
reference.

## Commits

### List commits on a repository

You can list commits using `listCommits`, it takes as arguments:

- the repository coordinates (`owner` and `name` of the repository).
- `SHA` or branch to start listing commits from. Default: the repository’s default branch (usually `master`).
- `path`: Only commits containing this file path will be returned.
- `author`: GitHub login or email address by which to filter by commit author.
- `since`: Only commits after this date will be returned. Format: "YYYY-MM-DDTHH:MM:SSZ".
- `until`: Only commits before this date will be returned. Format: "YYYY-MM-DDTHH:MM:SSZ".
- `pagination`: Limit and Offset for pagination.

To list commits:

The `result` on the right is the corresponding [List[Commit]][repository-scala].

See [the API doc](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository) for full
reference.

## Contents

### Get contents

This method returns the contents of a file or directory in a repository.

You can get contents using `getContents`, it takes as arguments:

- the repository coordinates (`owner` and `name` of the repository).
- `path`: The content path.
- `ref`: The name of the `commit/branch/tag`. Default: the repository’s default branch (usually `master`).

To get contents:


The `result` on the right is the corresponding [NonEmptyList[Content]][repository-scala].

See [the API doc](https://developer.github.com/v3/repos/contents/#get-contents) for full
reference.

## Releases

### Create a release

Users with push access to the repository can create a release using `createRelease`; it takes as arguments:

- the repository coordinates (`owner` and `name` of the repository).
- `tag_name`: The name of the tag.
- `name`: The name of the release.
- `body`: Text describing the contents of the tag.
- `target_commitish`: Specifies the commitish value that determines where the `Git tag` is created from.
Can be any branch or commit `SHA`. Unused if the `Git tag` already exists. Default: the repository's default branch (usually `master`).
- `draft`: true to create a draft (unpublished) release, false to create a published one. Default: false.
- `prerelease`: true to identify the release as a pre-release. false to identify the release as a full release. Default: false.

To create a release:

As a result, if you'd like to see a feature supported, feel free to create an issue and/or a pull request!

[repository-scala]: https://github.com/47deg/github4s/blob/master/github4s/shared/src/main/scala/github4s/free/domain/Repository.scala
[user-scala]: https://github.com/47deg/github4s/blob/master/github4s/shared/src/main/scala/github4s/free/domain/User.scala
