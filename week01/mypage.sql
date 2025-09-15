SELECT  user.name , user.email , user.phone_num, user.point
FROM user
WHERE user_id = :userId;