(ns onefiftysix)

(= (#(zipmap %2 (repeat (count %2) %1)) 0 [:a :b :c]) {:a 0 :b 0 :c 0})
;; => true

(defn foo [d coll] (zipmap coll (repeat (count coll) def)))
