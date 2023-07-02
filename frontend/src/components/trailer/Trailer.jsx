import React from 'react'
import ReactPlayer from 'react-player'
import { useParams } from 'react-router-dom'
import './trailer.css'


export default function Trailer() {

    let param = useParams();
    let key = param.ytTrailerId;


    return (
        <div className="react-player-containet">
            {(key != null) ? (<ReactPlayer url={`https://www.youtube.com/watch?v=${key}`} controls={true} />) : (<div>Loading...</div>)}

        </div>
    )
}
