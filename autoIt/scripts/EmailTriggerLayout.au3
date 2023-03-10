#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00004009)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00004009' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00004009->' & $aResult[1] & ')')
EndIf

EndFunc

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-start
_WinWaitActivate("Focus-Configure Transactions - Google Chrome","")
#comments-end
MouseClick("left",944,196,1)
Sleep(2000)
MouseClick("left",942,276,1)
Sleep(2000)
MouseClick("left",479,549,1)
Sleep(2000)
MouseClick("left",1020,267,1)
Sleep(2000)
MouseClick("left",1037,413,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(335,509)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1013,582,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(522,509)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1029,435,1)
Sleep(2000)
MouseClick("left",577,507,1)
Sleep(2000)
MouseClick("left",1039,436,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(538,506)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1225,490,1)
Sleep(2000)
MouseClick("left",1022,386,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(515,505)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1039,663,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(587,505)
Sleep(2000)
MouseUp("left")
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
