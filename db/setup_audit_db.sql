use AuditDemo;

drop table if exists audit;

-- Create audit table
create table audit(
    audit_id double primary key auto_increment,
    user_id varchar(128),
    timestamp timestamp,
    level varchar(5),
    activity varchar(50),
    activity_detail varchar(1024)
);
