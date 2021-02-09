Create Table Rice (
    id integer not null generated always as identity, -- 自動累加的序號
    Title varchar(50),
    編號 varchar(50),
    品名 varchar(50),
    國際條碼 varchar(50),
    廠商名稱 varchar(50),
    廠商地址 varchar(50),
    檢驗結果 varchar(50),
    不合格原因 varchar(255),
    違反規定 varchar(50),
    行政處分 varchar(50),
    Log_UpdateTime varchar(50),
    primary key(id)
)

