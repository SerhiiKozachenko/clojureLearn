(ns test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


;; press ctrl+enter to evaluate inline func and result

(defn greeting-3 [name]
  (cond
   (= name "Paul") "hey Paul!"
   (= name "Stevan") "hello Stevan"
   :else (str "whatup " name)))

(greeting-3 "john")

(defn greeting-4 [name]
  (condp = name
    "Paul" "hey Paul!"
    "stevan" "hello stevan"

    true ::> "hello"))

(greeting-4 "yo")


(defn what-country [name]
  (condp = name
    "Paul" "Ukraine"
    "saha" "Ukraine"
    true ::> "Unknown"))

(defn what-country2 [name]
  (cond = name
    (= name "Paul")
    (= name "stevan")
      "Ukraine"
    :else (str "Unknown")))

(what-country2 "serg")





;; vars
(def name "serg")

;; dynamic var
;; using the recommeded *[name]* style
(def ^:dynamic *name* "serg")
(str "hi " *name*)


(defn say-hi []
  (str "hi " *name*))

(binding [*name* "Paul"]
  (say-hi)
  )

(say-hi)



(defn names []
  (let [paul "Paul"
        john "John"
        saha "saha"]
    (str paul john saha)))

(names)


;; immutable thread safe var
(def a-name (atom "John"))


;; get value of it
(deref a-name)

;; shorhand
@a-name

;; ! means mutate
(reset! a-name "john")


(swap! a-name (fn [old] (str "hi " old)))

@a-name







;; collections


;; types:
;; #"/\d/" - regex
;; :keyword


:keyword :live :staging


;; list
'(1 2 3 4 5 6)

;; add to list
(conj '(1 2 3 4 5 6) 0)

(first '(1 2 3 4 5))

(rest '(1 2 3 4 5))


(def my-list '(1 2 3 4 5))

(conj my-list 0)
my-list


(map (fn [item] (inc item)) my-list)
(filter (fn [item] (= 3 item)) my-list)

;; vector

(def my-vec [1 2 3 4 5])


;; always apped to th end instead of list
(conj my-vec 6)

;; get item by index
(my-vec 2)

([0 0 0 0 0 2] 2)


;; sets

(def my-set #{0 1 2 3})

;; uniq
(conj my-set 3)






















































































