# API

###List of registered orders

```
GET registration/list
```
Parameters

```
page: 1
size: 2
doctorId: 111,
deptId: 111,
patientId: 111,
patientName: name,
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": {
        "pageNum": 1,
        "pageSize": 2,
        "totalSize": 5,
        "totalPages": 3,
        "content": [
            {
                "id": "01bbbf0e9c5e4e369583bc459b71d99c",
                "num": null,
                "doctorId": "463",
                "deptId": "2",
                "patientId": "63",
                "patientName": "11",
                "cost": 10.0,
                "operator": "空",
                "type": 6,
                "status": 4,
                "createTime": "2019-07-28T05:22:26.000+0000"
            },
            {
                "id": "56cd5c04f4444c80bf59e12d1ce5324f",
                "num": null,
                "doctorId": "463",
                "deptId": "1",
                "patientId": "63",
                "patientName": "就就",
                "cost": 10.0,
                "operator": "空空",
                "type": 6,
                "status": 4,
                "createTime": "2019-07-28T05:21:33.000+0000"
            }
        ]
    }
}
```

###Create registration

```
POST /registration
```

Parameters

```
status: 4,
doctorId: 111,
deptId: 101,
patientId: 111,
patientName: name,
cost: 10,
operator: oName,
type: 6
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}    
```

###Update registration status

```
PUT /registration/status
```

Parameters

```
id: 4,
status: 2
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}    
```

###Delete registration

```
DELETE /registration/
```

Parameters

```
id: 4
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}
```

###Query the name of the registration

```
GET /registration/status
```

Parameters

```
null
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}    
```


###Query all department names

```
GET /dept/name
```

Parameters

```
null
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}
```

###Query all doctor names

```
GET /doctor/name
```

Parameters

```
null
```

return

```
{
    "code": 0,
    "msg": "Successful!",
    "data": null
}
```