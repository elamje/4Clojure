(ns thirtyeight)
 
(defn maxer [& nums]
  (loop [num1 (first nums)
         numrest (rest nums)] 
    (println numrest)
    (if (<= (count numrest) 0) 
      num1
      (recur (if (> num1 (first numrest)) num1 (first numrest)) (rest numrest)))))


(= (maxer 1 8 3 4) 8)
    
