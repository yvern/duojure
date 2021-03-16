# Setup

## JDK
You will need a JDK, and as clojure strives for retro-compatibility just as java itself, most of them would be fine. As from the pairing setup, you probably already have openJDK 11 installed

## Clojure
Originally, clojure used to need you to either manage the classpaths and deps by hand, or use the maven build tool. Then leiningen came up, which already bundles many common tasks and has plugins and templates for just about anything. We wont use it though, we will use the clojure cli tools, installable via `brew install clojure`

## Editor
One of the selling point of lisps is their development experience, tightly coupled to the editor of choice. The old school tool for such is Emacs, which is itself programmable with a lisp flavour. Although very popular and powerful, we dont have the spare 20 years needed to configure it properly. We will use vscode, most surely already installed if not familiar.
But then we will need something more: Calva, an extension that basically turns vscode into a human-centered version of an emacs configuration. Install it via `code --install-extension betterthantomorrow.calva` or look for it in the extension marketplace