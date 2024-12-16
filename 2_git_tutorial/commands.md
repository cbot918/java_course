## 觀念
1. git 是用來做程式碼版本管理，主要理由是要發布新版本的時候，需要有個紀錄，例如：
```
版本-使用者-任務編號-版本訊息
1.00-yale-a1001-註冊登入功能：新增 User 物件
1.01-jack-a1005-註冊登入功能：新增 username 欄位驗證規則
1.02-node-a1013-錯誤修正：日期計算使用西元年
1.03-yale-a1016-註冊登入功能：新增 Auth 物件
```

2. git 是一個本地的紀錄版本的應用，檔案會放在 .git 資料夾裡面，裡面就會有類似上面的文字紀錄．

3. github 是遠端的git服務，可以有異地備份以及多人共同開發的效果


## 安裝 Git 及註冊 Github
在 git網頁操作
1. github id
2. 開 repo
3. 下載 repo

## 本地 git 指令
在本地操作
```bash
1. git init
2. git add .
3. git git commit -m "commit message 1"
4. git push
```

## 更多 git 指令
```bash
1. git remote -v                        # 看遠端連線
2. git branch -a                        # 看分支
3. git checkout -b [新分支] [原分支]      # 複製分支
```

## 練習
- 複製 repo 到本地，新增一個 commit，推上去