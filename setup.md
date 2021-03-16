# Setup
This instructions assume you are on the office macbooks, which already have homebrew installed

## JDK
You will need a JDK, and as clojure strives for retro-compatibility just as java itself, most of them would be fine. As from the pairing setup, you should already have some jdk (probably openJDK 11 or 15) installed. If not, you can always `brew install openjk`, `brew install openjk@11` or any other means

## Clojure
Originally, clojure used to need you to either manage the classpaths and dependencies by hand, or use the maven build tool. Then leiningen came up, which already bundles many common tasks and has plugins and templates for just about anything. We wont use it though, we will use the clojure cli tools, installable via `brew install clojure`

## Editor
One of the selling point of lisps is their development experience, tightly coupled to the editor of choice. The old school tool for such is Emacs, which is itself programmable with a lisp flavour. Although very popular and powerful, we dont have the spare 20 years needed to configure it properly. We will use vscode, most surely already installed if not familiar. If for some reason you dont, just `brew install visual-studio-code`.
But then we will need something more: Calva, an extension that basically turns vscode into a human-centered version of an emacs configuration. Install it via `code --install-extension betterthantomorrow.calva` or look for it in the extension marketplace