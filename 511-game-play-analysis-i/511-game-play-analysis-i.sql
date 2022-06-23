/* Write your PL/SQL query statement below */

Select player_id "player_id",min(to_char(event_date,'YYYY-MM-DD'))"first_login"
from Activity
group by player_id;
