(ns language.general)

;; ## Language is language, but not just that

(def cool-message
  "language in isolation is only part of the story:
   history, cultural immersion,
   learning communication patterns
   and even thought models are what make it all worth it!")

;; ### Language Family, Dialects and [Sprachbund](https://en.wikipedia.org/wiki/Sprachbund)

;; clojure didn't just appear out of nowhere, 
;; it is just a branch of a large and ancient familiy of languages: the LISP family.
;; 
;; as such, it ~~inherits~~ adheres to many features from its ancestors, 
;; from overall look and feel to semantics and behaviour

;; ### The LISP alphabet

;; the written form of clojure is quite daunting to the uninitiated due to the delimiters,
;; 
;; much like many languages with consonant clusters.
;; 
;; so dont be afraid, it is quite fast to get used too, and soon you will see
;; it actually helps you delimit ~~scopes~~ sentences more easily!

;; that said, in clojure you can use in strings even emojis as identifiers! try it out at a repl:
(def hard-rockers! ["👩‍🎤" "🧑‍🎤" "👨‍🎤"])
(def 🆔 identity)

;; since you can use a wide variety of characters for naming things,
;; in clojure we tend to give maning to the char usage:

;; * `even?` is not only a valid name, 
;; but is a clojure function! names endend in `?` usually mean a predicate, 
;; something that takes a value and returns a boolean, like answering a question
(even? 2) ; yes! it is true

;; * `assoc!` the 'bang' at the end is to call your attention, 
;; because this results in a *mutation*. 
;; sometimes also used on side-effecting functions. 
;; it is good practice in FP to keep track of those, and naming helps
(assoc! (transient {}) :a 1)

;; ### Learning to communicate, not just to speak

;; some languages work like a sentence in german:
;; 
;; you need to hear it to the end to actually get it
;; (and it may even be rude to interrupt the ~~compiler~~ speaker!).

;; this usually frees up the order of your meaningful pieces,
;; 
;; so you can put emphasis on what you think matters the most,
;; 
;; like putting your `main` point on top and pushing ~~utils~~ details to the end.

;; clojure, on the other hand, 
;; needs you to put things on the right order of dependency,
;; 
;; because it works more like a conversation in japanese:
;; 
;; you communicate a small pience of information (a top level s-exp sent to the repl)
;; 
;; and expect some sort of ack (hai!) from the listener.
;; 
;; so that the prefered way of developing a ~~project~~ conversation is through the famed REPL Driven Development.
(comment
  (defn my-func [x] (my-add x 2))
  
  (defn my-add [y z] (+ y z)))

;; now that we know about ordering, we can proceed to [shape and content](language.grammar.morphology.html)