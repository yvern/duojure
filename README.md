# Setup
This instructions assume if you are on macOS, you already have homebrew installed.

## JDK
You will need a JDK, and as clojure strives for retro-compatibility just as java itself, most of them would be fine.

If not, you can always
```bash
brew install openjk
```
If on linux, i would recommend [SDKman](https://sdkman.io/)

## Clojure
Originally, clojure used to need you to either manage the classpaths and dependencies by hand, or use the maven build tool.

Then leiningen came up, which already bundles many common tasks and has plugins and templates for just about anything.

We won't use it though, we will use the clojure cli tools, installable via
```bash
brew install clojure
```

or the [official install scripts](https://clojure.org/guides/getting_started)

## Editor
One of the selling point of lisps is their development experience, tightly coupled to the editor of choice.

The old school tool for such is Emacs, which is itself programmable with a lisp flavour.

Although very popular and powerful, we dont have the spare years needed to configure it properly and get used to it.

we will use vscode, most surely already installed, if not familiar.

If for some reason you dont, just
```bash
brew install visual-studio-code
```
But then we will need something more: Calva

its an extension that basically turns vscode into a human-centered version of an emacs configuration.

Install it via

```bash
code --install-extension betterthantomorrow.calva
```

or look for it in the extension marketplace.

once that is done, we can get to say our first words with the namespace `language.basic`