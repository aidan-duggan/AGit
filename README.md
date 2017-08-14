# AGit

I have modified MGit for my personnal usage.

# MGit

MGit is a Git client Android App.

This is a continuation of [the SGit project](https://github.com/sheimi/SGit).

## Notes

[![Build Status](https://travis-ci.org/maks/MGit.svg?branch=master)](https://travis-ci.org/maks/MGit)

[![Join the chat at https://gitter.im/MGit-Android/Lobby](https://badges.gitter.im/MGit-Android/Lobby.svg)](https://gitter.im/MGit-Android/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

* If you encounter any issues (bugs, crashes, etc.) and want to help improve this project, please open an issue on [GitHub](https://github.com/maks/MGit/issues/new) describing: what the issues are; and how they were caused, to allow for re-creation and fixing of bugs.
* This app requires minimum of for Android v4.x.

## Supported Features

* Create local repositories
* Clone remote repositories
* Pull from origin
* Delete local repositories
* Browse files
* Browse commit messages (short)
* Checkout branches and tags
* HTTP/HTTPS/SSH are supported (including SSH with private key passphrase)
* Username/Password authentication is supported
* Search local repositories
* Private key management
* Manually choose code language
* `git diff` between commits
* Import existing repositories (that is, you can copy a repository from computer and import to MGit)
* Checkout remote branches
* Merge branches
* Push merged content
* Edit file (built-in editor or external app that can edit the given file type)
* Commit and push changed files
* Committer information
* Prompt for password
* *Option* to save username/password
* `git status`
* Cancel when cloning
* Add modified file to stage
* View state of staged files (aka index)
* `git rebase`
* `git cherrypick`
* `git checkout <file>` (reset changes of a file)

[![Android app on Google Play](https://developer.android.com/images/brand/en_app_rgb_wo_45.png)](https://play.google.com/store/apps/details?id=com.manichord.mgit)
[![Android app on F-Droid](https://f-droid.org/wiki/images/c/c4/F-Droid-button_available-on.png)](https://f-droid.org/repository/browse/?fdid=com.manichord.mgit)

## Quick start

### Clone a remote repository

1. Click on the `+` icon to add a new repository
2. Enter remote URL (see URL format below)
3. Enter local repository name - note that this is **not** the full path, as MGit stores all  
repositories in the same local directory (can be changed in MGit settings)
4. Click the `Clone` button
5. If required, you will be prompted for credentials to connect to the remote repo. MGit will download the repository (all branches) to your device

### Create a local repository
1. Click on the `+` icon to add a new repository
2. Click on `Init Local` to create a local repository
3. Enter the name for this repository when prompted
4. A local empty repo will be created

### URL format

#### SSH URLs

* SSH running on standard port (22): `ssh://username@server_name/path/to/repo`
* SSH running on non-standard port: `ssh://username@server_name:port/path/to/repo`
* `username` is needed - by default, MGit tries to connect as root.

#### HTTP(S) URLs

* HTTP(S) URL: `https://server_name/path/to/repo`

## ToDo List

[Future enhancements and bugs are tracked here on Github](https://github.com/maks/MGit/issues).

## License

See [GPLv3](./LICENSE)

All code written by `maks@manichord.com` can at your option also be used under the [MIT license](https://en.wikipedia.org/wiki/MIT_License).

## Help

If you want to help improve this project, contributions, especially translations are very welcome.

Fork from this repo, create a new branch, commit your changes and then send a pull request against 
the **master** branch of this repo.
