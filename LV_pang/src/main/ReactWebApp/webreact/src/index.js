import React from 'react';
import ReactDom from 'react-dom';
import './index.css';

class HelloWorld extends React.Component {
    render(){
        return <div className='divTagTest'>
            <h1>hello world</h1>
            <hr/>
            <h4>this is render test</h4>
        </div>
    }
}

class RenderPage extends React.Component{
    render(){
        return <div className='loadTag'>
            <span className='spandTag'>
                this is a span tag name 
            </span>
        </div>
    }
}

class ReactWebStaring extends React.Component{
    render(){
        return <div className='nav'>
            <ul>
                <li>list 1번</li>
                <li>list 2번</li>
                <li>list 3번</li>
                <li>list 4번</li>
            </ul>
        </div>
    }
}

ReactDom.render(
    <HelloWorld/>,
    document.getElementById('root')
)

ReactDom.render(
    <RenderPage/>,
    document.getElementById("renderRoot0")
)
ReactDom.render(
    <RenderPage/>,
    document.getElementById("renderRoot2")
)