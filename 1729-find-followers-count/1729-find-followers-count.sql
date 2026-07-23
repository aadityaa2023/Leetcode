select f.user_id, count(distinct f.follower_id) as followers_count from Followers as f
GROUP BY f.user_id;
