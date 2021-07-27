# MarsRover
this is a kata about TDD
## 火星车tasking

### 初始化
* input: position(0,0)  direction("N")
* output: state{position(0,0)  direction("N")}

### 移动
* 向前
* 初始位置(0,0）
* input: North output:(0,1)
* input: West  output:(-1,0)
* input: East  output:(1,0)
* input: South output:(0,-1)

### 转向
* 输入为当前小车方向
* 左转
* input:North output:West
* input:West  output:South
* input:East  output:North
* input:South output:East

* 右转
* input:North output:East
* input:West  output:North
* input:East  output:South
* input:South output:West

