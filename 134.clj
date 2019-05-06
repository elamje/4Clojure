(ns onethirtyfour)

(fn foo [k coll]
  (and (nil? (coll k)) (contains? coll k)))

(true?  (#(and (nil? (%2 %1)) (contains? %2 %1)) :a {:a nil :b 2}))
;; => true
