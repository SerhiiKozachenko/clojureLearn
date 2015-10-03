(ns test.util.log
  (:gen-class))

(defn debug
  "I will print line in console"
  [err]
  (str "DEBUG: " err)
  )

;; get the docs of function
(str doc debug)


(use 'clojure.repl)
(doc doc)

(use 'clojure.repl)


