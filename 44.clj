(ns fortyfour)

(defn rot [n coll]
        (let [n (rem n (count coll))] (if (pos? n)
                                        (concat (drop n coll) (take n coll))
                                        (concat (take-last (* -1 n) coll) (take (+ (count coll) n) coll)))))

(= (rot 1 '(:a :b :c)) '(:b :c :a))



