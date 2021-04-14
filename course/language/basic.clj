(ns language.basic)

;; # Your First Sentence in Clojure!

;; ---

;; ~~from a repl~~ colloquially one could tersely say:
(println "hello world!")

;; ---

(ns my-letter.main
  "or, if you are writing a ~~program~~ document, it should be more formal:"
  (:gen-class))

;; we can define/name things for later use, like:
(def formal-salutation "greetings my dearest world!")

(defn -main
  "this is the `main` function, that basically
   becomes the main method of the generated static class"
  [& _args]
  (println formal-salutation))


;; after this leats learn more about [counting and numbers](language.counting.html)