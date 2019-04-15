(ns 38)

(= (
(fn [num1 num2 & nums]
  (loop 
      (if (> num))))))
 

(fn [& nums]
  (loop [num1 (first nums)
         num2 (second nums)
         nums (nthrest nums 2)]
      (if (> num1 num2)
        (recur num1 nums)
        (recur num2 nums))))

(= ((fn [& nums]
  (loop [num1 (first nums)
         nums (rest nums)]
    (if (not= nil nums)
       (if (> num1 (first nums))
        (recur num1 nums)
        (recur (first nums) nums))
       num1))) 1 8 3 4) 8)
